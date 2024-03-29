package irvine.oeis.a194;
// Generated by gen_seq4.pl parm4 at 2021-09-13 12:18

import irvine.math.cr.CR;
/**
 * A194418 Numbers m such that Sum_{k=1..m} (&lt;1/3 + k*r&gt; - &lt;k*r&gt;) &gt; 0, where r=sqrt(3) and &lt; &gt; denotes fractional part.
 * @author Georg Fischer
 */
public class A194418 extends A194368 {

  /** Construct the sequence. */
  public A194418() {
    super(4, CR.THREE.sqrt(), CR.ONE_THIRD);
  }
}
