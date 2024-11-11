package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073045 Nonprime solutions to sopfr(n) = S(n), where sopfr(n) = A001414 and S(n) = A002034.
 * @author Sean A. Irvine
 */
public class A073045 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073045() {
    super(1, 1, new A002034(), (n, k) -> !Z.valueOf(n).isProbablePrime() && Functions.SOPFR.z(n).equals(k));
  }
}
