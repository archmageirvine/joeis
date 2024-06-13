package irvine.oeis.a070;

import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002379;

/**
 * A070759 n for which floor((3/2)^n) is prime.
 * @author Sean A. Irvine
 */
public class A070759 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070759() {
    super(1, 0, new A002379(), (Predicate<Z>) Z::isProbablePrime);
  }
}
