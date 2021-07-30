package irvine.oeis.a049;

/**
 * A049373 Number of n-node planar graphs with minimum degree at least 5.
 * @author Sean A. Irvine
 */
public class A049373 extends A049369 {

  @Override
  protected int minDegree() {
    return 5;
  }
}
