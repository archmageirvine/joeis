package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310450 Coordination sequence Gal.6.601.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310450 extends TilingSequence {

  /** Construct the sequence. */
  public A310450() {
    super(0, new String[]
        { "6.3.6.3;B60+2,C300+1,B0-1,D120+1"
        , "6.3.3.3.3;A0-3,A300+1,D60+5,E0+2,C60-5"
        , "6.3.3.3.3;A60+2,F300+1,E240-5,E60-1,B60-5"
        , "6.3.3.3.3;A240+4,F60-2,F240-4,E300+3,B300+3"
        , "3.3.3.3.3.3;C60-4,B0+4,D60+4,F300-5,C240-3,E180+6"
        , "6.3.3.3.3;C60+2,D60-2,F180+3,D240-3,E300-4"
        });
    defineBaseSet(0);
  }
}
