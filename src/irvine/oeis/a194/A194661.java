package irvine.oeis.a194;
// Generated by gen_seq4.pl 2025-02-18.ack/trilambn at 2025-02-18 23:09

import irvine.math.cr.CR;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A194661 Triangular array: T(n,k)=[&lt;n*r&gt;+&lt;k*r&gt;], where [ ] = floor, &lt; &gt; =  fractional part, and r = (1+sqrt(5))/2 (the golden ratio).
 * @author Georg Fischer
 */
public class A194661 extends LambdaTriangle {

  /** Construct the sequence. */
  public A194661() {
    super(1, 1, 1, (n, k) -> {
      final CR r = CR.PHI;
      return r.multiply(n).frac().add(r.multiply(k).frac()).floor();
    });
  }
}
