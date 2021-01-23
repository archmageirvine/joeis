package irvine.oeis.a033;

/**
 * A033054 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m} has d(i)=1 for m-i odd.
 * @author Sean A. Irvine
 */
public class A033054 extends A033053 {

  @Override
  protected int base() {
    return 3;
  }
}
