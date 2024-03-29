package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314266 Coordination sequence Gal.5.321.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314266 extends TilingSequence {

  /** Construct the sequence. */
  public A314266() {
    super(0, new String[]
        { "6.3.3.3.3;A60+2,A300+1,B300+2,C0+2,B0+3"
        , "3.3.3.3.3.3;C60+3,A60+3,A0+5,C0+1,D0+2,E0+3"
        , "3.3.3.3.3.3;B0+4,A0+4,B300+1,E300+2,D180+5,D0+3"
        , "3.3.3.3.3.3;E0+4,B0+5,C0+6,D180+4,C180+5,E120+1"
        , "3.3.3.3.3.3;D240+6,C60+4,B0+6,D0+1,E120+6,E240+5"
        });
    defineBaseSet(0);
  }
}
