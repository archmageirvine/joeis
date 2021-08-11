package irvine.oeis.a050;

import irvine.oeis.a006.A006753;

/**
 * A050225 1/3-Smith numbers.
 * @author Sean A. Irvine
 */
public class A050225 extends A006753 {

  @Override
  protected long multiplier() {
    return 3;
  }
}
