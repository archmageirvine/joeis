package irvine.oeis.a032;

/**
 * A032848 Numbers n such that base 10 representation Sum{d(i)*10^i: i=0,1,...,m} has d(m)&lt;d(m-1)&gt;d(m-2)&lt;...
 * @author Sean A. Irvine
 */
public class A032848 extends A032841 {

  @Override
  protected long base() {
    return 10;
  }
}
