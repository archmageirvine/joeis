package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A050945 Six consecutive integers with decreasing values of sigma start at these numbers: sigma(x) &gt; sigma(x+1) &gt; sigma(x+2) &gt; sigma(x+3) &gt; sigma(x+4) &gt; sigma(x+5).
 * @author Sean A. Irvine
 */
public class A050945 extends A050944 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z s3 = Jaguar.factor(t.add(3)).sigma();
      final Z s4 = Jaguar.factor(t.add(4)).sigma();
      if (s3.compareTo(s4) > 0 && s4.compareTo(Jaguar.factor(t.add(5)).sigma()) > 0) {
        return t;
      }
    }
  }
}
