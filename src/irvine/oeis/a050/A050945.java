package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A050945 Numbers k such that sigma(k) &gt; sigma(k+1) &gt; sigma(k+2) &gt; sigma(k+3) &gt; sigma(k+4) &gt; sigma(k+5).
 * @author Sean A. Irvine
 */
public class A050945 extends A050944 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z s3 = Functions.SIGMA1.z(t.add(3));
      final Z s4 = Functions.SIGMA1.z(t.add(4));
      if (s3.compareTo(s4) > 0 && s4.compareTo(Functions.SIGMA1.z(t.add(5))) > 0) {
        return t;
      }
    }
  }
}
