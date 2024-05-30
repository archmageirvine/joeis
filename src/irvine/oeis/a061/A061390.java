package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.Sequence2;

/**
 * A061390 Use same rules as A047988. Sequence gives smallest numbers which require n steps to reach 2.
 * @author Sean A. Irvine
 */
public class A061390 extends RecordPositionSequence {

  // Cf. A052491

  /** Construct the sequence. */
  public A061390() {
    super(1, new Sequence2() {

      private long mN = 1;

      @Override
      public Z next() {
        ++mN;
        int steps = 0;
        final TreeSet<Long> expanded = new TreeSet<>(); // values already encountered
        TreeSet<Long> currentSteps = new TreeSet<>(); // values having current steps
        TreeSet<Long> next = new TreeSet<>(); // values that steps one more
        currentSteps.add(mN);
        while (true) {
          if (currentSteps.isEmpty()) {
            currentSteps = next;
            next = new TreeSet<>();
            ++steps;
          }
          final long v = currentSteps.pollFirst();
          if (v == 2) {
            return Z.valueOf(steps);
          }
          if (expanded.add(v)) {
            next.add(v + 1);
            if (v > 2) {
              next.add(v - 1);
            }
            for (long s = Functions.SQRT.l(v); s >= 2; --s) {
              if (v % s == 0) {
                next.add(v / s);
              }
            }
          }
        }
      }
    }, 2);
    next();
  }
}
