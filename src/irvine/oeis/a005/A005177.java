package irvine.oeis.a005;

/**
 * A005177 Number of connected regular graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005177 extends A005176 {

  @Override
  protected int connectionLevel() {
    return 1;
  }
}

