package irvine.oeis.a031;

/**
 * A031171 <code>a(n) = prime(n+9) - prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A031171 extends A031169 {

  @Override
  protected int shift() {
    return 9;
  }
}
