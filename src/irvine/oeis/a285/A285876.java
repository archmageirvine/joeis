package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285876.
 * @author Sean A. Irvine
 */
public class A285876 extends A048987 {

  @Override
  protected Position start() {
    return new Position("rn1qk1nr/pppppppp/8/8/8/8/PPPPPPPP/RN1QK1NR w KQkq - 0 1", true);
  }
}

