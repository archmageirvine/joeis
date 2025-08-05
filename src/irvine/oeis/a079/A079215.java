package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a063.A063171;

/**
 * A079215 Catalan paths: numbers starting with 1 and ending with 1 where each digit is positive and adjacent digits differ by 1.
 * @author Sean A. Irvine
 */
public class A079215 extends Sequence0 {

  private final Sequence mS = new A063171();

  @Override
  public Z next() {
    final String s = mS.next().toString();
    final StringBuilder sb = new StringBuilder().append('1');
    if (s.length() > 1) {
      char d = '1';
      for (int k = 0; k < s.length(); ++k) {
        if (s.charAt(k) == '1') {
          if (++d > '9') {
            throw new UnsupportedOperationException();
          }
        } else {
          --d;
        }
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}
