package irvine.oeis.a204;

import irvine.oeis.a003.A003057;
import irvine.oeis.a203.A203991;

/**
 * A204168 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of (i+j), as in A003057.
 * @author Georg Fischer
 */
public class A204168 extends A203991 {

  /** Construct the sequence. */
  public A204168() {
    super(2, new A003057());
  }
}
