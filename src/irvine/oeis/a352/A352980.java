package irvine.oeis.a352;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352980 a(n) = Sum_{1 &lt;= i &lt; j &lt; k &lt;= n} (k*j*i)^3.
 * @author Georg Fischer
 */
public class A352980 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352980() {
    super(0, "[0,1,-13,78,-286,715,-1287,1716,-1716,1287,-715,286,-78,13,-1]",
      "0,0,0,216,16280,335655,3587535,25421200,135459216,584760870,2145870870,6918983280",
      0);
  }
}
