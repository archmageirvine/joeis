package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070330 extends FilterSequence {

  /** Construct the sequence. */
  public A070330() {
    super(1, new A070331(), k -> k.gcd(30).equals(Z.ONE));
  }
}
