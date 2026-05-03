package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395539 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A395539 extends Sequence0 {

  private static final Q[] SEQ = {
    new Q(365, 46),
    new Q(29, 161),
    new Q(79, 575),
    new Q(679, 451),
    new Q(3159, 413),
    new Q(83, 407),
    new Q(473, 371),
    new Q(638, 355),
    new Q(434, 335),
    new Q(89, 235),
    new Q(17, 209),
    new Q(79, 122),
    new Q(31, 183),
    new Q(41, 115),
    new Q(517, 89),
    new Q(111, 83),
    new Q(305, 79),
    new Q(23, 73),
    new Q(73, 71),
    new Q(61, 67),
    new Q(37, 61),
    new Q(19, 59),
    new Q(89, 57),
    new Q(41, 53),
    new Q(833, 47),
    new Q(53, 43),
    new Q(86, 41),
    new Q(13, 38),
    new Q(23, 37),
    new Q(67, 31),
    new Q(71, 29),
    new Q(83, 19),
    new Q(475, 17),
    new Q(59, 13),
    new Q(41, 291),
    new Q(1, 7),
    new Q(1, 11),
    new Q(1, 1024),
    new Q(1, 97),
    new Q(89, 1)
  };
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (final Q v : SEQ) {
      final Q q = v.multiply(mN);
      if (q.isInteger()) {
        return q.toZ();
      }
    }
    throw new RuntimeException();
  }
}
