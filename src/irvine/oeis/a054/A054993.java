package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a008.A008980;

/**
 * A054993 Number of "long curves", i.e., topological types of smooth embeddings of the oriented real line into the oriented plane that coincide with the standard immersion x -&gt; (x,0) in the neighborhood of -infinity and +infinity.
 * @author Sean A. Irvine
 */
public class A054993 extends A008980 {

  @Override
  public Z next() {
    super.next();
    return mAllCurves.getNoOrientsSum(mN);
  }
}

