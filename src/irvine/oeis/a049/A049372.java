package irvine.oeis.a049;

/**
 * A049372 Number of n-node planar graphs with minimum degree at least 4.
 * @author Sean A. Irvine
 */
public class A049372 extends A049369 {

  @Override
  protected int minDegree() {
    return 4;
  }
}
