package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A052486 Achilles numbers - powerful but imperfect: if n = Product(p_i^e_i) then all e_i &gt; 1 (i.e., powerful), but the highest common factor of the e_i is 1, i.e., not a perfect power.
 * @author Sean A. Irvine
 */
public class A052486 extends A001694 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z powerful = super.next();
      if (powerful.isPower() == null) {
        return powerful;
      }
    }
  }
}
