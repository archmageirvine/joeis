package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000984;

/**
 * A086359 Fixed point if [decimal-digit-sum]-function at initial-value=A000984(n)=C[2n,n] is iterated.
 * @author Sean A. Irvine
 */
public class A086359 extends Sequence1 {

  private final Sequence mA = new A000984().skip();

  @Override
  public Z next() {
    Z t = mA.next();
    while (true) {
      final Z u = t;
      t = Functions.DIGIT_SUM.z(t);
      if (t.equals(u)) {
        return t;
      }
    }
  }
}
