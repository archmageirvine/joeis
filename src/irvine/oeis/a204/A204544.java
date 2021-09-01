package irvine.oeis.a204;
// manually floorn at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A204544 Fractional part of (3/2)^n without the decimal point.
 * x:= 1.5 ^n: y:=floor((x-floor(x))*10^n):
 * @author Georg Fischer
 */
public class A204544 extends FloorSequence {

  /** Construct the sequence. */
  public A204544() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(new Q(3, 2).pow(n)).frac().multiply(CR.TEN.pow(n)).floor();
  }

}
