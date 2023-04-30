package irvine.oeis.a057;

import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a055.A055079;

/**
 * A057838 Numbers k such that A055079(k) = 2^k.
 * @author Sean A. Irvine
 */
public class A057838 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A057838() {
    super(1, new A055079(), new Predicate<>() {

      private int mN = 0;

      @Override
      public boolean test(final Z term) {
        return term.equals(Z.ONE.shiftLeft(++mN));
      }
    });
  }
}
