package irvine.oeis.a172;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A172609 a(n) = (8n)!/(8!^n).
 * @author Georg Fischer
 */
public class A172609 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A172609() {
    super(0, "[[0],[0,-5040, 104544,-840448, 3465728,-8028160, 10551296,-7340032, 2097152],[-5040]]", "[1]", 0);
    // seq(coeff(expand((8*n-7)*(8*n-6)*(8*n-5)*(8*n-4)*(8*n-3)*(8*n-2)*(8*n-1)*n),n,j),j=0..9);
  }
}
