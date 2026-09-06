package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014092;
import irvine.oeis.a058.A058080;

/**
 * A086473 Numbers in A058080 having only one factor pair (both distinct from 1) that add up to a sum belonging to A014092.
 * @author Sean A. Irvine
 */
public class A086473 extends FilterSequence {

  private static final TreeSet<Z> S = new TreeSet<>();
  private static final Sequence SEQ = new A014092();
  {
    S.add(SEQ.next());
  }

  private static boolean is(final Z k) {
    while (k.compareTo(S.last()) > 0) {
      S.add(SEQ.next());
    }
    return S.contains(k);
  }

  /** Construct the sequence. */
  public A086473() {
    super(1, new A058080(), n -> {
      final Z[] divs = Jaguar.factor(n).divisors();
      int cnt = 0;
      for (final Z d : divs) {
        if (!d.isOne() && d.square().compareTo(n) <= 0) {
          if (is(d.add(n.divide(d))) && ++cnt > 1) {
            return false;
          }
        }
      }
      return cnt == 1;
    });
  }
}

