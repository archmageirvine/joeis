package irvine.oeis.a032;

/**
 * A032940 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032940 extends A032937 {

  @Override
  protected int base() {
    return 5;
  }
}
