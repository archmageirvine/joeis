package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285877 Number of possible chess games at the end of the n-th ply starting without pawns.
 * @author Sean A. Irvine
 */
public class A285877 extends A048987 {

  @Override
  protected Position start() {
    return new Position("rnbqkbnr/8/8/8/8/8/8/RNBQKBNR w KQkq - 0 1", true);
  }
}

