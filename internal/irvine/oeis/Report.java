package irvine.oeis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.oeis.cons.RealConstantSequence;
import irvine.oeis.producer.PariSequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.recur.LinearRecurrence;
import irvine.util.LimitedLengthPriorityQueue;
import irvine.util.string.Date;
import irvine.util.string.StringUtils;

/**
 * Generate a report on implemented sequences.
 * @author Sean A. Irvine
 */
public final class Report {

  private Report() { }

  // Needs to be above maximum id currently assigned in the OEIS.
  private static final int MAX_ID = 370000;

  private static String rightAlign(final int cnt) {
    final String s = StringUtils.rep(' ', 12) + cnt;
    return s.substring(s.length() - 12);
  }

  /**
   * Main program.
   * @param args ignored
   */
  public static void main(final String[] args) {
    System.out.println("Starting report at " + Date.now());
    int total = 0;
    int withOffset = 0;
    int dead = 0;
    int noncomputable = 0;
    int recurrence = 0;
    int cons = 0;
    int pari = 0;
    final LimitedLengthPriorityQueue<String> slowest = new LimitedLengthPriorityQueue<>(10, true);
    for (int a = 1; a < MAX_ID; ++a) {
      if (a == 34195 || a == 34196 || a == 34197 || (a >= 34219 && a <= 34240) || a == 36332 || (a >= 36612 && a <= 36647)) { // todo fix these cases!
        continue;
      }
      final String aNumber = SequenceFactory.getCanonicalId("A" + a);
      if (a % 10000 == 0) {
        StringUtils.message(aNumber);
      }
      try {
        final long t = System.currentTimeMillis();
        final Sequence seq = SequenceFactory.sequence(aNumber);
        final long constructTime = System.currentTimeMillis() - t;
        slowest.add(constructTime, aNumber);
        ++total;
        if (seq instanceof SequenceWithOffset) {
          ++withOffset;
        }
        if (seq instanceof DeadSequence) {
          ++dead;
        }
        if (seq instanceof NoncomputableSequence) {
          ++noncomputable;
        }
        if (seq instanceof HolonomicRecurrence || seq instanceof LinearRecurrence) {
          ++recurrence;
        }
        if (seq instanceof RealConstantSequence) {
          ++cons;
        }
        if (seq instanceof PariSequence) {
          ++pari;
        }
      } catch (final UnsupportedOperationException e) {
        // too bad
      }
    }
    System.out.println("Total sequences implemented: " + rightAlign(total));
    System.out.println("Recurrences:                 " + rightAlign(recurrence));
    System.out.println("Real number constants:       " + rightAlign(cons));
    System.out.println("SequencesWithOffset:         " + rightAlign(withOffset));
    System.out.println("DeadSequence:                " + rightAlign(dead));
    System.out.println("NoncomputableSequence:       " + rightAlign(noncomputable));
    System.out.println();
    System.out.println("PariSequence:                " + rightAlign(pari));
    System.out.println();
    System.out.println("Slowest constructors (ms):");
    final List<LimitedLengthPriorityQueue.Node<String>> lst = new ArrayList<>(slowest);
    Collections.reverse(lst);
    for (final LimitedLengthPriorityQueue.Node<String> node : lst) {
      System.out.println(node.getScore() + " " + node.getValue());
    }
    System.out.println();
    System.out.println("Finished report at " + Date.now());
  }
}

