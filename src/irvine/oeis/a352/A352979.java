package irvine.oeis.a352;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352979 a(n) = Sum_{k=1..n} Sum_{j=1..k} Sum_{i=1..j} (k*j*i)^3.
 * @author Georg Fischer
 */
public class A352979 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352979() {
    super(0, "[0,1,-13,78,-286,715,-1287,1716,-1716,1287,-715,286,-78,13,-1]",
      "0,1,585,28800,505280,4951530,33209946,170320080,714724560,2566030995",
      0);
  }
}
