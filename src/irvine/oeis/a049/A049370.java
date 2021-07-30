package irvine.oeis.a049;

/**
 * A049370 Number of n-node planar graphs with minimum degree at least 2.
 * @author Sean A. Irvine
 */
public class A049370 extends A049369 {

  @Override
  protected int minDegree() {
    return 2;
  }
}
