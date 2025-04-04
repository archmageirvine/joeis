package irvine.oeis.a009;

/**
 * A009350 If x and y are terms, so is x*y + 9.
 * @author Sean A. Irvine
 */
public class A009350 extends A009293 {

  @Override
  protected long add() {
    return 9;
  }
}
