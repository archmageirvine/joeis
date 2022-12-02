package irvine.oeis.a352;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352413 G.f. A(x) satisfies: A(x)^4 = (1-x) * (A(x) + x)^3.
 * @author Georg Fischer
 */
public class A352413 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352413() {
    super(0, "[[0],[-13740,10763,-2748,229],[19476,-19281,6243,-660],[-6912,9333,-4161,606],[336,-755,585,-148],[0,-60,81,-27]]", "[1,2,-6,22,-115]", 0);
  }
}
