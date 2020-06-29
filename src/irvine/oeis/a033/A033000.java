package irvine.oeis.a033;

import irvine.oeis.a032.A032995;

/**
 * A033000 If d,e are consecutive digits of n in base 12, then <code>|d-e|&gt;=5</code>.
 * @author Sean A. Irvine
 */
public class A033000 extends A032995 {

  @Override
  protected int base() {
    return 12;
  }
}
