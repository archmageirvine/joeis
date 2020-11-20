package irvine.oeis.a032;

/**
 * A032954 Numbers n such that base 4 representation Sum_{i=0,..m} d(i)*4^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032954 extends A032953 {

  @Override
  protected int base() {
    return 4;
  }
}
