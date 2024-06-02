package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a068.A068664;

/**
 * A070069 a(1) = 11; a(n) = smallest palindromic multiple of a(n-1).
 * @author Sean A. Irvine
 */
public class A070069 extends A068664 {

  /** Construct the sequence. */
  public A070069() {
    super(Z.valueOf(11));
  }
}
