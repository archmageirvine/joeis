package irvine.oeis.a032;

/**
 * A032939 Numbers n such that base 4 representation Sum{d(i)*4^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032939 extends A032937 {

  @Override
  protected int base() {
    return 4;
  }
}
