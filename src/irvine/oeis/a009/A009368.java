package irvine.oeis.a009;

/**
 * A009368 If a, b in sequence, so is ab+10.
 * @author Sean A. Irvine
 */
public class A009368 extends A009293 {

  @Override
  protected long add() {
    return 10;
  }
}
