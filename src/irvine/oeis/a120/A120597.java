package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120597 G.f. satisfies: 9*A(x) = 8 + 8*x + A(x)^5, starting with [1,2,10].
 * <code>holdfin(A123, 0,-9049*(n-3)*(n-2)*(n-1)*n*A^4+100000*(n-1)*(n-2)*(n-3)*(2*n-3)*A^3+30000*(n-2)*(n-3)*(10*n^2-40*n+39)*A^2+10000*(n-3)*(2*n-5)*(10*n^2-50*n+57)*A+80*(5*n-9)*(5*n-13)*(5*n-17)*(5*n-21), [1, 2, 10, 120], "a(n)");</code>
 * @author Georg Fischer
 */
public class A120597 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120597() {
    super(0, "[[0],[3341520,-4920000, 2620000,-600000, 50000],[8550000,-13770000, 8140000,-2100000, 200000],[7020000,-13050000, 8970000,-2700000, 300000],[1800000,-4500000, 4000000,-1500000, 200000],[0, 54294,-99539, 54294,-9049]]", "[1, 2, 10, 120]", 0);
  }
}
