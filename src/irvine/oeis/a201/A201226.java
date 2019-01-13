package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A201226.
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
