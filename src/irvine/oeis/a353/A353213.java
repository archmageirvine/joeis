package irvine.oeis.a353;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a006.A006897;

/**
 * A353213 Number of simple unlabeled non-null graphs on &lt;= n nodes.
 * @author Georg Fischer
 */
public class A353213 extends A006897 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
