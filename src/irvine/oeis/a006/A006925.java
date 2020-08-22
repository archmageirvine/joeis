package irvine.oeis.a006;

/**
 * A006925 Number of connected trivalent graphs with 2n nodes and girth exactly 5.
 * @author Sean A. Irvine
 */
public class A006925 extends A006924 {

  @Override
  protected int girth() {
    return 5;
  }
}

