package irvine.oeis.a006;

/**
 * A006923 Number of connected trivalent graphs with <code>2n</code> nodes and with girth exactly 3.
 * @author Sean A. Irvine
 */
public class A006923 extends A006924 {

  @Override
  protected int girth() {
    return 3;
  }
}

