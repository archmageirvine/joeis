package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285878.
 * @author Sean A. Irvine
 */
public class A285878 extends A048987 {

  @Override
  protected Position start() {
    return new Position("4k3/pppppppp/8/8/8/8/PPPPPPPP/4K3 w - - 0 1", true);
  }
}

