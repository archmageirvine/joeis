package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A201226 Values y for infinite sequence <code>x^3-y^2 =</code> d with decreasing coefficient <code>r=sqrt(x)/d</code> which tend to <code>1/(1350*sqrt(5))or</code> infinity family of solutions Mordell curve with extension <code>sqrt(5)</code>.
 * @author Sean A. Irvine
 */
public class A201226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201226() {
    super(new long[] {-1, 6118, -1970319, 33501524, -1970319, 6118},
      new Z[] {
        Z.valueOf(476425),
        Z.valueOf(3499913125L),
        Z.valueOf(20477027135825L),
        Z.valueOf(118398467411226125L),
        new Z("684132799477496491225"),
        new Z("3952927722012200964659125")
      });
  }
}
