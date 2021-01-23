package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a001.A001317;

/**
 * A038183 One-dimensional cellular automaton 'sigma-minus' (Rule 90): 000,001,010,011,100,101,110,111 -&gt; 0,1,0,1,1,0,1,0.
 * @author Sean A. Irvine
 */
public class A038183 extends A001317 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
