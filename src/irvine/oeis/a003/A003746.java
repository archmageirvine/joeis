package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A003746 Number of spanning trees with degrees 1 and 3 in O_5 X P_2n.
 * @author Sean A. Irvine
 */
public class A003746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003746() {
    super(1, new long[]{
      0,
      0,
      154793410560000L,
      0,
      26359905185169408L,
      0,
      59399388450127872L,
      0,
      206265260306202624L,
      0,
      -1512329782916284416L,
      0,
      1043959728550182912L,
      0,
      -745271272714235904L,
      0,
      -167487137019375616L,
      0,
      29721236628888576L,
      0,
      -12936942677605376L,
      0,
      3354655475796480L,
      0,
      471457558327040L,
      0,
      -142686379766272L,
      0,
      12586530486400L,
      0,
      -384432909824L,
      0,
      -11015685472L,
      0,
      185361600,
      0,
      10745408,
      0,
      311460,
      0,
      2976,
      0,
    },
      new Z[]{
        Z.ZERO,
        Z.valueOf(540),
        Z.ZERO,
        Z.valueOf(1751352),
        Z.ZERO,
        Z.valueOf(5386703316L),
        Z.ZERO,
        Z.valueOf(16582103036544L),
        Z.ZERO,
        Z.valueOf(51045000577926816L),
        Z.ZERO,
        new Z("157132783947988296192"),
        Z.ZERO,
        new Z("483704801377335372564480"),
        Z.ZERO,
        new Z("1488997578825205151673656448"),
        Z.ZERO,
        new Z("4583609224965381313988566950144"),
        Z.ZERO,
        new Z("14109810402621649533503234558344704"),
        Z.ZERO,
        new Z("43434494483860386599671308650864330496"),
        Z.ZERO,
        new Z("133705220498070622788909783421076412386304"),
        Z.ZERO,
        new Z("411587292562609297454750726054600269987912704"),
        Z.ZERO,
        new Z("1266996896366237649178359003459366628005457649664"),
        Z.ZERO,
        new Z("3900220352788196660232362097608501848215326938755072"),
        Z.ZERO,
        new Z("12006121596612176283154633057320394687803565435297505280"),
        Z.ZERO,
        new Z("36958669704287162536274146164634194441880201040907341168640"),
        Z.ZERO,
        new Z("113770567399219775084499535791661980035376168565367523333734400"),
        Z.ZERO,
        new Z("350222075358923174025212352063864697242943327666094722900436582400"),
        Z.ZERO,
        new Z("1078095195203820521745918151197065855397382661823414208194364252422144"),
        Z.ZERO,
        new Z("3318720696661962582358070874565591095886422622888933137425721520537337856")
      }
    );
  }

  @Override
  public Z next() {
    super.next(); // skip zeros
    return super.next();
  }
}
