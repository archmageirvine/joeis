package irvine.oeis.a033;

/**
 * A033054 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(i)=1 for m-i odd.
 * @author Sean A. Irvine
 */
public class A033054 extends A033053 {

  @Override
  protected int base() {
    return 3;
  }
}
