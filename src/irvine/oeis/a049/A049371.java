package irvine.oeis.a049;

/**
 * A049371 Number of n-node planar graphs with minimum degree at least 3.
 * @author Sean A. Irvine
 */
public class A049371 extends A049369 {

  @Override
  protected int minDegree() {
    return 3;
  }
}
