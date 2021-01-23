package irvine.oeis.a031;

/**
 * A031172 a(n) = prime(n+10) - prime(n).
 * @author Sean A. Irvine
 */
public class A031172 extends A031169 {

  @Override
  protected int shift() {
    return 10;
  }
}
