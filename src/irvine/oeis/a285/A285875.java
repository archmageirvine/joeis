package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285875 Number of possible chess games at the end of the n-th ply starting without knights.
 * @author Sean A. Irvine
 */
public class A285875 extends A048987 {

  @Override
  protected Position start() {
    return new Position("r1bqkb1r/pppppppp/8/8/8/8/PPPPPPPP/R1BQKB1R w KQkq - 0 1", true);
  }
}

