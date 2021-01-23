package irvine.oeis.a032;

/**
 * A032891 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m has d(0)&gt;=d(1)&lt;=d(2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032891 extends A032890 {

  @Override
  protected int base() {
    return 3;
  }
}
