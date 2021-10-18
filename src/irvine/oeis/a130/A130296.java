package irvine.oeis.a130;
// manually triprod at 2021-10-10 19:58

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A130296 Triangle read by rows: T[i,1]=i, T[i,j]=1 for 1 &lt; j &lt;= i = 1,2,3,...
 * @author Georg Fischer
 */
public class A130296 extends Triangle {

  /** Construct the sequence */
  public A130296() {
    super();
  }

  @Override
  protected Z compute(final int n, final int k) {
    final Z result;
    if (k < 0 || k > n) {
      result = Z.ZERO;
    } else if (n == 0) { 
      result = Z.ONE;
    } else if (k == 0) { 
      result = Z.valueOf(n + 1);
    } else {
      result = Z.ONE;
    }
    return result;
  }
}
